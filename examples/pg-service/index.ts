// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import * as pulumi from "@pulumi/pulumi";
import * as aiven from "@pulumi/aiven";

const config = new pulumi.Config();
const projectName = config.require("projectName");

const service = new aiven.Pg("my-new-service", {
        project: projectName,
        cloudName: 'google-us-east4',
        plan: 'business-4',
        pgUserConfig: {
            adminUsername: 'master',
            adminPassword: 'demoPassword1234-',
            pgVersion: '15',
            backupHour: 2,
            backupMinute: 1,
        },
        maintenanceWindowDow: 'sunday',
        maintenanceWindowTime: '14:00:00',
    },
);

export const serviceName = service.serviceName;
