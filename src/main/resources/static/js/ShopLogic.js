$(function () {
    $('#order').click(function () {
        var newLength = new Array;
        chbox1 = document.getElementById('option1');
        chbox2 = document.getElementById('option2');
        chbox3 = document.getElementById('option3');
        chbox4 = document.getElementById('option4');
        if ((chbox1.checked)){
            newLength.push(chbox1.value);
        }
        if ((chbox2.checked)){
            newLength.push(chbox2.value);
        }
        if ((chbox3.checked)){
            newLength.push(chbox3.value);
        }
        if ((chbox4.checked)){
            newLength.push(chbox4.value);
        }

        $.ajax({
             url: '/Shop/order',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: 'POST',
            data: JSON.stringify({
                'id': $('#id').val(),
                'fio': $('#fio').val(),
                 'basket': newLength.toString()
             }),
             success: function () {
                 alert('Заказ оформлен');
             },
         });
    });
});
$(function () {
    $('#show').click(function () {

        var newLength = new Array;
        chbox1 = document.getElementById('option1');
        chbox2 = document.getElementById('option2');
        chbox3 = document.getElementById('option3');
        chbox4 = document.getElementById('option4');
        if ((chbox1.checked)){
            newLength.push(chbox1.value);
        }
        if ((chbox2.checked)){
            newLength.push(chbox2.value);
        }
        if ((chbox3.checked)){
            newLength.push(chbox3.value);
        }
        if ((chbox4.checked)){
            newLength.push(chbox4.value);
        }

        $.ajax({
            url: '/Shop/show',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: 'GET',
            data: JSON.stringify({
                id: $('#id').val(),
                fio: $('#fio').val(),
                'basket': newLength.toString()
            }),
            success: function () {
                alert('Вы заказали' + newLength.toString());
            },
        });
    });
});