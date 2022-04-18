$target = "$env:windir\Temp\" 
$dir = Get-ChildItem $target -Recurse 
$list = $dir | Where-Object{ $_.extension -eq ".tmp" } 
Foreach ($_ in $list) { 
    $_.name  | Out-File -FilePath C:\Users\zixua\OneDrive\Desktop\myScripts\tmp.txt -Append
} 
