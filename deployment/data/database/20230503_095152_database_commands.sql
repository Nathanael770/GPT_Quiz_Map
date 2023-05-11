ALTER TABLE "quizcarte$test" ADD "createddate" TIMESTAMP NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('43985686-0b0a-3f0b-86ab-663f22329d2b', 
'55253436-1b89-4ecf-9837-e6171400cb4a', 
'createdDate', 
'createddate', 
20, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230503 09:51:52';
