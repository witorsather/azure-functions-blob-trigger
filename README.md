# Trigger Azure Functions on Blob Containers using Event Subscription

## Introduction
This tutorial guides you through the process of triggering Azure Functions based on events raised when a blob is added to a container. By leveraging event subscriptions and Azure Event Grid, you can reduce latency and enhance the responsiveness of your functions.

## Prerequisites
Before getting started, ensure you have the following:
- An Azure account with an active subscription. You can create one for free.
- Java Development Kit (JDK) version 8, 11, 17, or 21 (for Linux).
- Apache Maven version 3.0 or above.
- Visual Studio Code installed on one of the supported platforms.
- The Java extension pack for Visual Studio Code.
- The Azure Functions extension for Visual Studio Code.
- The ngrok utility for creating a tunnel to your local machine.
- Azure Storage extension for Visual Studio Code (version 5.x or above).

## Tutorial Content
This tutorial is based on the [Trigger Azure Functions on blob containers using an event subscription](https://learn.microsoft.com/en-us/azure/azure-functions/functions-event-grid-blob-trigger?tabs=isolated-process%2Cnodejs-v4&pivots=programming-language-java) tutorial provided by Microsoft.

It covers the following steps:
1. Creating a general-purpose v2 storage account in Azure Storage.
2. Creating a container in blob storage.
3. Creating an event-driven Blob Storage-triggered function.
4. Creating an event subscription to a blob container.
5. Debugging locally using ngrok by uploading files.
6. Deploying to Azure and creating a filtered event subscription.

## Usage
To use this tutorial:
1. Follow the steps outlined in the tutorial.
2. Adapt the provided code snippets to your project's requirements.
3. Debug locally to ensure everything works as expected.
4. Deploy your project to Azure for production use.

## Contributing
Contributions to this tutorial are welcome. If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.

## License
This tutorial is licensed under the [MIT License](LICENSE).
