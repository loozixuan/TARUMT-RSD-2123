$dir = "C:\Windows\"
$files = Get-ChildItem $dir -Recurse -Include *.log -ErrorAction SilentlyContinue
$files

#with -ErrorAction SilentlyContinue, it will silently continue even error happen