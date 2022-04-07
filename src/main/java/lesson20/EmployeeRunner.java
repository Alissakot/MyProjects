//package lesson20;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;
//import jakarta.xml.bind.JAXBContext;
//import jakarta.xml.bind.JAXBException;
//import jakarta.xml.bind.Marshaller;
//import lombok.SneakyThrows;
//import org.w3c.dom.Document;
//import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.xpath.*;
//import java.io.*;
//import java.math.BigDecimal;
//import java.math.MathContext;
//import java.math.RoundingMode;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class EmployeeRunner {
//    public static String filePath = "C:\\Users\\urban\\Downloads\\string.xml";
//
//    public static void main(String[] args) throws Exception {
//        Vacancy manager = new Vacancy("менеджер", new BigDecimal(50000));
//        Vacancy cleaner = new Vacancy("уборщик", new BigDecimal(22000));
//        Headquarter sales = new Headquarter("продажи", "Медвежьегорск");
//        Headquarter service = new Headquarter("обслуживание", "Медвежьегорск");
//        Employee employee1 = new Employee("Кошкин Иван Сергеевич", "Koshka", 1234, sales, manager);
//        Employee employee2 = new Employee("Смирнова Анна Георгиевна", "Smirnova", 1564, service, cleaner);
//        Employee employee3 = new Employee("Раджабова Зульфия Махмудовна", "Zulfiya", 1464, service, cleaner);
//        Employees employees = new Employees();
//        employees.setEmployees(Arrays.asList(employee1, employee2, employee3));
//        writeToXML(employees);
//    }
//
//    @SneakyThrows
//    private static void writeToXML(Employees employees) throws ArithmeticException {
//        BigDecimal salarySum = BigDecimal.ZERO;
//        for (int i = 0; i < employees.employees.size(); i++) {
//            salarySum = salarySum.add(employees.employees.get(i).vacancy.salary);
//        }
//        BigDecimal middleSalary = salarySum.divide(new BigDecimal((employees.employees.size())), RoundingMode.HALF_UP);
//        JAXBContext context = JAXBContext.newInstance(Employees.class);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//
//        StringWriter stringWriter = new StringWriter();
//        marshaller.marshal(employees, stringWriter);
//        System.out.println("XML: " + stringWriter);
//
//        try (FileWriter writer = new FileWriter(filePath)) {
//            writer.write(String.valueOf(stringWriter));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
//        builderFactory.setNamespaceAware(true);
//        DocumentBuilder builder;
//        Document doc = null;
//        try {
//            builder = builderFactory.newDocumentBuilder();
//            doc = builder.parse(filePath);
//            XPathFactory xpathFactory = XPathFactory.newInstance();
//            XPath xpath = xpathFactory.newXPath();
//
//            List<String> names = getMiddleSalary(doc, xpath, middleSalary);
//            System.out.println("Работники с зарплатой выше среднего значения: "
//                    + Arrays.toString(names.toArray()));
//
//        } catch (ParserConfigurationException | SAXException | IOException e) {
//            e.printStackTrace();
//        }
//        jsonBuilder();
//
//    }
//
//    private static List<String> getMiddleSalary(Document doc, XPath xpath, BigDecimal middleSalary) {
//        List<String> list = new ArrayList<>();
//        try {
//            XPathExpression xPathExpression = xpath.compile(
//                    "/employees/employee/vacancy[salary>" + middleSalary + "]/../fio/text()");
//            NodeList nodeList = (NodeList) xPathExpression.evaluate(doc, XPathConstants.NODESET);
//            for (int i = 0; i < nodeList.getLength(); i++)
//                list.add(nodeList.item(i).getNodeValue());
//        } catch (XPathExpressionException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//    private static void jsonBuilder() throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader(filePath));
//        String content = br.lines().collect(Collectors.joining("\n"));
//
//        XmlMapper xmlMapper = new XmlMapper();
//        JsonNode node = xmlMapper.readTree(content.getBytes());
//        ObjectMapper mapper = new ObjectMapper();
//        System.out.println(mapper.writeValueAsString(node));
//
//        List<JsonNode> employee = node.findValues("fio");
//        System.out.println("Cотрудники с нечетными индексами в списке:");
//        for (int i = 1; i < employee.size() + 1; i++) {
//            if (i % 2 == 1) {
//                System.out.println(employee.get(i - 1));
//            }
//        }
//
//    }
//}
