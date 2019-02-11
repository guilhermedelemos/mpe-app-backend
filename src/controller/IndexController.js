module.exports = {
    
    async index(req, res) {
        return res.json({date: new Date(), message: "MPE App is running"});
    },

};
