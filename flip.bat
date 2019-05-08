
$path = "C:\Users\Windows8.1\Desktop\Java\ProjectProgmeth\res\Goblin\attck>" #target directory

[System.Reflection.Assembly]::LoadWithPartialName("System.Drawing")
Get-ChildItem -recurse ($path) -include @("*.png", "*.jpg") |
ForEach-Object {
  $image = [System.Drawing.image]::FromFile( $_ )
  $image.rotateflip("Rotate90FlipNone")
  $image.save($_)
}
