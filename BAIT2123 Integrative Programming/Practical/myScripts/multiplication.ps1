Write-Host "MULTIPLICATION TABLE" -ForegroundColor Green
$multiplier_str = Read-Host -Prompt 'Enter the multiplier: '
$multiplier = [int]::Parse($multiplier_str)

Write-Host "The multiplication table for $multiplier" -ForegroundColor Green
for ($i=1; $i-le 12; $i++){
    $ans = ($multiplier * $i)
    Write-Host "	$i x $multiplier = $ans"
} 