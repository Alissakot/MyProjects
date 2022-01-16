package lesson19;

import lombok.RequiredArgsConstructor;

import java.lang.reflect.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class AccountRunner {
    public static void main(String[] args) throws Exception {
        Object individualAcc = new IndividualAccount("Иванов Алексей", "4321");
        Class<?> individualAccClass = individualAcc.getClass();

        IndividualAccount newAcc = new IndividualAccount("Иванов Алексей", "4321");

        Blockable account = (Blockable) Proxy.newProxyInstance(AccountRunner.class.getClassLoader(),
                new Class[]{Blockable.class},
                new ProxyHandler(newAcc));
        account.deposit(new BigDecimal(100), "false");
        System.out.println(newAcc.getBalance());

        System.out.println("Все методы класса: " + Arrays.toString(individualAccClass.getDeclaredMethods()));

        Class superclass = individualAccClass.getSuperclass();

        Field[] fields = superclass.getDeclaredFields();
        Field nameField = fields[0];
        nameField.setAccessible(true);

        Method getBalanceIndividual = individualAccClass.getMethod("getBalance");

        Method depositIndividual = individualAccClass.getDeclaredMethod("deposit", BigDecimal.class, String.class);
        depositIndividual.invoke(individualAcc, new BigDecimal(1000), "true");

        Method withdrawIndividual = individualAccClass.getDeclaredMethod("withdraw", BigDecimal.class, String.class);
        withdrawIndividual.invoke(individualAcc, new BigDecimal(334), "true");
        System.out.println("На балансе аккаунта " + nameField.get(individualAcc) + " осталось: " + getBalanceIndividual.invoke(individualAcc));

        Object entityAcc = new EntityAccount("ООО \"Котики\"", "1234");
        Class<?> entityAccClass = entityAcc.getClass();


        Method getBalance = entityAccClass.getDeclaredMethod("getBalance");
        getBalance.setAccessible(true);

        Method depositEntity = entityAccClass.getDeclaredMethod("deposit", BigDecimal.class, String.class);
        depositEntity.setAccessible(true);
        depositEntity.invoke(entityAcc, new BigDecimal(500), "");

        Method withdrawEntity = entityAccClass.getDeclaredMethod("withdraw", BigDecimal.class, String.class);
        withdrawEntity.setAccessible(true);
        withdrawEntity.invoke(entityAcc, new BigDecimal(200), "");
        System.out.println("На балансе аккаунта " + nameField.get(entityAcc) + " осталось: " + getBalance.invoke(entityAcc));

    }

    @RequiredArgsConstructor
    private static class ProxyHandler implements InvocationHandler {

        private final IndividualAccount origin;

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            Object result = "";
            Method declaredMethod = origin.getClass().getDeclaredMethod(method.getName(), method.getParameterTypes());
            Blocked annotation = declaredMethod.getAnnotation(Blocked.class);
            if (args[1] == "true") {
                result = declaredMethod.invoke(origin, args);
            } else {
                result = "ваш аккаунт заблокирован";
            }
            System.out.println(result);
            return result;
        }
    }
}
