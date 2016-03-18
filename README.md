IBM MobileFirst Platform Foundation
===
## Trust Association Interceptor
A sample server demonstrating use of the Trust Association Interceptor filter.

### Tutorials
https://mobilefirstplatform.ibmcloud.com/tutorials/en/foundation/8.0/authentication-and-security/protecting-external-resources/

### Usage

You can deploy the project on supported application servers (WebSphere Full profile and WebSphere Liberty profile).  
[Download the simple Java servlet](https://github.com/MobileFirst-Platform-Developer-Center/TrustAssociationInterceptor/tree/release80).

### Sample usage

1. Make sure to [update the confidential client](https://mobilefirstplatform.ibmcloud.com/tutorials/en/foundation/8.0/authentication-and-security/protecting-external-resources/#confidential-client) and secret values in the MobileFirst Operations Console.
2. Deploy either of the security checks: **[UserLogin](https://mobilefirstplatform.ibmcloud.com/tutorials/en/foundation/8.0/authentication-and-security/user-authentication/security-check/)** or **[PinCodeAttempts](https://mobilefirstplatform.ibmcloud.com/tutorials/en/foundation/8.0/authentication-and-security/credentials-validation/security-check/)**.
3. Register the matching application.
4. Map the `accessRestricted` scope to the security check.
5. Update the client application to make the `WLResourceRequest` to your servlet URL.

### Supported Levels
IBM MobileFirst Platform Foundation 8.0

### License
Copyright 2016 IBM Corp.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
att
http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
