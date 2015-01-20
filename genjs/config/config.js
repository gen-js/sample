var config = {
    inDir: "templates",
    outDir: "..",
    packageBase: "org.demo",
    overwrite: true,
    isWatching: true,
    watch:{
        includes:[
            "model", "helpers", "fragments", "templates", "config"
        ]
    }
};

module.exports = config;
