document.getElementById('converterForm').addEventListener('submit', function(event) {
    event.preventDefault();
    convertCurrency();
});

function convertCurrency() {
    var sourceCurrency = document.getElementById('sourceCurrency').value.toUpperCase();
    var targetCurrency = document.getElementById('targetCurrency').value.toUpperCase();
    var sourceAmount = document.getElementById('sourceAmount').value;

    fetch('/api/v1/convert?sourceCurrency=' + sourceCurrency + '&targetCurrency=' + targetCurrency + '&sourceAmount=' + sourceAmount)
        .then(response => response.json())
        .then(data => {
            document.getElementById('result').innerText = 'Converted Amount: ' + data.toFixed(2);
        })
        .catch(error => {
            console.error('Error:', error);
            document.getElementById('result').innerText = 'Error occurred while converting currency. Please try again.';
        });
}
