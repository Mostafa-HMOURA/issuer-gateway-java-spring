
const dataType = document.getElementById("data").innerText;
console.log(dataType);

document.addEventListener('DOMContentLoaded', function () {
    try {
        var data = document.getElementById("providers").getAttribute("data-datatype");
        var data = JSON.parse(data);
        var selectedProviders = data[dataType];

        console.log('dataType:', dataType);
        console.log('data:', data);
        console.log('selectedProviders:', selectedProviders);

        selectedProviders.forEach(function (provider) {
            // Create a card element for each provider
            var card = document.createElement("div");
            card.className = "col-6 col-md-3 mt-2";

            // Create the card layout
            var cardLayout = `
                <div class="card">
                    <img src="${provider.image}" class="card-img-top p-3" alt="..." style="height: 100px;">
                    <div class="card-body">
                        <h6 class="card-title">${provider.name}</h6>
                        <p class="card-text"></p>
                        <button onclick="openModal('${dataType}', '${provider.value}', '${provider.name}', '${provider.type}')" class="btn btn-custom">Pull your ${dataType}</button>
                    </div>
                </div>
            `;

            // Find the container element to display the provider information
            var container = document.getElementById("card");

            // Set the card layout as the innerHTML of the card element
            card.innerHTML = cardLayout;

            // Append the card to the container
            container.appendChild(card);
        });
    } catch (error) {
        console.error('Error:', error);
        redirect();
    }
});



function redirect() {
    // Construct the URL for the provider information page with the data type parameter
    var url = "/error"

    // Open the provider information page in a new window or tab
    window.location.href = url
}

function openModal(dataType, sinData, providerName, type) {

    var titleElement = document.querySelector(".modal-header h5");
    titleElement.textContent = dataType;

    // Update the modal content with the SIN data
    var modalBody = document.getElementById("sinText");
    var modalBody2 = document.getElementById("sinText2");
    var modalBody3 = document.getElementById("sinText3");
    modalBody.innerHTML = `Your ${dataType} is : <b id="value">${sinData}</b>`;
    modalBody2.innerHTML = `From <b id="value2">${providerName}</b>.`;
    modalBody3.innerHTML = `VC Type : <b id="value3">${type}</b>.`;

    // Show the modal
    var modal = new bootstrap.Modal(document.getElementById("sinModal"));
    modal.show();
}



