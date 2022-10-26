// Exo sur ArrayEntity

const result = db.ArrayEntity.find({
    "values.1": {"$exists":true}

})
    printjson(result)