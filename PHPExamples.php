// Read

// Get
$res = $myBucket->get(‘document_name’);

// Write

// Insert
$res = $myBucket->insert('document_name', array('some'=>'value'));

// Upsert
$res = $myBucket->upsert('document_name', array('some'=>'value'));

// Replace
$res = $myBucket->replace('document_name', array('some'=>'value'));