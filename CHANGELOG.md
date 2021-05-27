CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

## 4.1.0 (2021-05-27)
* Upgrade to v3.2.1 of the pulumi-terraform-bridge

## 4.0.2 (2021-05-21)
* Upgrade to v2.1.14 of the Aiven Terraform Provider

## 4.0.1 (2021-05-12)
* Upgrade to v2.1.13 of the Aiven Terraform Provider

## 4.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 3.6.1 (2021-04-14)
* Upgrade to v2.1.11 of the Aiven Terraform Provider

## 3.6.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 3.5.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 3.5.0 (2021-03-16)
* Upgrade to v2.1.9 of the Aiven Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 3.4.5 (2021-03-09)
* Upgrade to v2.1.8 of the Aiven Terraform Provider

## 3.4.4 (2021-02-16)
* Ensure the version is passed correctly to the ldflag as part of the build to prevent panic

## 3.4.3 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 3.4.2 (2021-02-15)
* Upgrade to v2.1.7 of the Aiven Terraform Provider

## 3.4.1 (2021-02-08)
* Upgrade to v2.1.6 of the Aiven Terraform Provider

## 3.4.0 (2021-01-29)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 3.3.4 (2021-01-26)
* Upgrade to v2.1.5 of the Aiven Terraform Provider

## 3.3.3 (2021-01-19)
* Upgrade to v2.1.4 of the Aiven Terraform Provider

## 3.3.2 (2021-01-12)
* Upgrade to v2.1.3 of the Aiven Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to pulumi v2.16.2

## 3.3.1 (2020-12-22)
* Upgrade to v2.1.2 of the Aiven Terraform Provider

## 3.3.0 (2020-12-04)
* Upgrade to pulumi-terraform-bridge v2.13.2  
  * This adds support for import specific examples in documentation
* Upgrade to v2.1.1 of the Aiven Terraform Provider

## 3.2.1 (2020-10-28)
* Upgrade to v2.0.11 of the Aiven Terraform Provider

## 3.2.0 (2020-10-26)
* Upgrade to v2.0.10 of the Aiven Terraform Provider
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 3.1.5 (2020-10-12)
* Upgrade to v2.0.7 of the Aiven Terraform Provider

## 3.1.4 (2020-09-25)
* Upgrade to v2.0.6 of the Aiven Terraform Provider

## 3.1.3 (2020-09-21)
* Upgrade to v2.0.5 of the Aiven Terraform Provider

## 3.1.2 (2020-09-14)
* Upgrade to v2.0.4 of the Aiven Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0

## 3.1.1 (2020-09-08)
* Upgrade to v2.0.3 of the Aiven Terraform Provider

## 3.1.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python
* Upgrade to v2.0.1 of the Aiven Terraform Provider

## 3.0.0 (2020-08-19)
* Upgrade to v2.0.0 of the Aiven Terraform Provider

## 2.2.1 (2020-08-06)
* Upgrade to v1.3.3 of the Aiven Terraform Provider
* Upgrade to pulumi-terraform-bridge v2.6.0
* Upgrade to Pulumi v2.7.1

## 2.2.0 (2020-06-30)
* Upgrade to v1.3.1 of the Aiven Terraform Provider

## 2.1.3 (2020-06-10)
* Switch to GitHub actions for build

## 2.1.2 (2020-05-28)
* Upgrade to Pulumi v2.3.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 2.1.1 (2020-05-12)
* Upgrade to pulumi-terraform-bridge v2.3.1

## 2.1.0 (2020-04-28)
* Regenerate datasource examples to be async
* Upgrade to pulumi-terraform-bridge v2.1.0

## 2.0.0 (2020-04-21)
* Upgrade to Pulumi v2.0.0
* Upgrade to pulumi-terraform-bridge v2.0.0

## 1.3.2 (2020-03-31)
* Upgrade to v1.2.3 of the Aiven Terraform Provider

## 1.3.1 (2020-03-04)
* Upgrade to v1.2.1 of the Aiven Terraform Provider

## 1.3.0 (2020-02-19)
* Upgrade to v1.2.0 of the Aiven Terraform Provider

## 1.2.3 (2020-02-07)
* Upgrade to v1.1.6 of the Aiven Terraform Provider

## 1.2.2 (2020-02-07)
* Upgrade to v1.1.5 of the Aiven Terraform Provider

## 1.2.1 (2020-01-24)
* Upgrade to v1.1.3 of the Aiven Terraform Provider

## 1.2.0 (2020-01-23)
* Upgrade to v1.1.1 of the Aiven Terraform Provider

## 1.1.0 (2019-12-04)
* Upgrade to support go 1.13.x
* Upgrade to pulumi-terraform@dotnet

## 1.0.0 (2019-11-12)
* Initial release of the provider.
