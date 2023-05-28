function openModal(dataType) {
    // Construct the URL for the provider information page with the data type parameter
    var url = "/issuer-gateway/providers?Credential=" + encodeURIComponent(dataType);

    // Open the provider information page in a new window or tab
    window.location.href = url
}
