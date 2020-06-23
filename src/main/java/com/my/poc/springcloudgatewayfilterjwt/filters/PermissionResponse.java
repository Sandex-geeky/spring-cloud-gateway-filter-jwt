package com.my.poc.springcloudgatewayfilterjwt.filters;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PermissionResponse {
    List<String> permissionsList;
}
