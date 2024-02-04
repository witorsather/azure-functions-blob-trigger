package com.function;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Azure Blob trigger.
 */
public class BlobTriggerEventGrid {
    /**
     * This function will be invoked when a new or updated blob is detected at the specified path. The blob contents are provided as input to this function.
     */
    @FunctionName("BlobTriggerEventGrid")
    public void run(
        @BlobTrigger(name = "file",
                     dataType = "binary",
                     path = "samples-workitems/{name}",
                     connection = "AzureWebJobsStorage") byte[] content,
        @BindingName("name") String filename,
        final ExecutionContext context
      ) {
        context.getLogger().info("Name: " + filename + " Size: " + content.length + " bytes");
      }
 }
