const express = require('express');

const routes = express.Router();

const IndexController = require("./controller/IndexController");

routes.get('/', IndexController.index);

module.exports = routes;
