package shim

import (
	"github.com/aiven/terraform-provider-aiven/internal/provider"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
)

func NewProvider() *schema.Provider {
	return provider.Provider()
}
