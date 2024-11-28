// Static content examples. These lists can be generated dynamically as an alternative.
List devList  = ["Select:selected", "Cluster Online - DEV", "Cluster Bank - DEV"]
List prodList  = ["Select:selected", "Cluster Online - PROD", "Cluster Bank - PROD"]

List default_item = ["None"]

if (Environment == 'DEV') {
  return devList
} else if (Environment == 'PROD') {
  return prodList
} else {
  return default_item
}