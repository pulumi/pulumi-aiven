#!/usr/bin/env bash

set -euo pipefail

(cd ~/code/upgrade-provider && go build)

~/code/upgrade-provider/upgrade-provider \
    pulumi/pulumi-aiven \
    --kind=bridge \
    --target-bridge-version=$(cd ~/code/pulumi-terraform-bridge && git rev-parse HEAD)
