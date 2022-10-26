// Exo sur ArrayEntity

const result = db.ArrayEntity.find(
    {
        "values" : { "$gt" : 2 }
    })
    printjson(result)
    