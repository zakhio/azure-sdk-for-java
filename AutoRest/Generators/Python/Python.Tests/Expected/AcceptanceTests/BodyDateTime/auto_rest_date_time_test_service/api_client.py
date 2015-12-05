# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.service_client import ServiceClient
from msrest import Configuration, Serializer, Deserializer
from .operations.datetime_model import datetime_model
from . import models


class AutoRestDateTimeTestServiceConfiguration(Configuration):

    def __init__(
            self, base_url=None, filepath=None):

        if not base_url:
            base_url = 'https://localhost'

        super(AutoRestDateTimeTestServiceConfiguration, self).__init__(base_url, filepath)

        self.user_agent = 'auto_rest_date_time_test_service/1.0.0'


class AutoRestDateTimeTestService(object):

    def __init__(self, config):

        self._client = ServiceClient(None, config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config
        self.datetime_model = datetime_model(
            self._client, self.config, self._serialize, self._deserialize)
