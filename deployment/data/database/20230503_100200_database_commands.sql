CREATE SEQUENCE "quizcarte$test_numero_test_mxseq" AS BIGINT START WITH 1;
ALTER TABLE "quizcarte$test" ADD "numero_test" BIGINT NULL;
UPDATE "quizcarte$test"
 SET "numero_test" = NEXT VALUE FOR "quizcarte$test_numero_test_mxseq";
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('7e35acb5-7ae6-4ac2-9840-bf7bbaae0582', 
'55253436-1b89-4ecf-9837-e6171400cb4a', 
'Numero_Test', 
'numero_test', 
0, 
0, 
'1', 
true);
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('7e35acb5-7ae6-4ac2-9840-bf7bbaae0582', 
'quizcarte$test_numero_test_mxseq', 
1, 
20);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230503 10:02:00';
