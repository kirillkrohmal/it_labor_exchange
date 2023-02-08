$FolderName = "src\main\resources\static\build\"
if (Test-Path $FolderName) {
 
    Write-Host "Folder Exists"
    Remove-Item $FolderName -Force
}
else {
    Write-Host "Folder Doesn't Exists"
}