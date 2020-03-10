package org.taymyr.lagom.demo.api;

import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import org.taymyr.lagom.javadsl.openapi.OpenAPIService;

public interface EmptyService extends OpenAPIService  {
    @Override
    default Descriptor descriptor() {
        return withOpenAPI(Service.named("test"));
    }
}
