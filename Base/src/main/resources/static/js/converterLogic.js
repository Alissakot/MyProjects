$(function () {
    $('#convert').click(function (){

        let question = $('input[name=question]:checked').val();
        let val = $('#val').val();

        if (!val) {
            alert('Укажите сумму!')
            return;
        }

        if (!(!isNaN(parseFloat(val)) && isFinite(val)))
        {
            alert('Неверные символы в поле ввода');
            return;
        }

        if (Math.sign(val) != 1)
        {
            alert('Введите число больше нуля');
            return;
        }

        $.ajax({
            url: '/Converter/convert?value=' + val + '&question=' + question,
            type: 'POST',
            success: function (result) {
                $('#result').text('Результат расчета суммы: ' + result.value);
            }
        });
    });
});