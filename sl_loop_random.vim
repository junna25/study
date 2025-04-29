" SLコマンドをランダムなオプションで実行し続けるVimスクリプト

function! RunSLContinuously()
  let options = ['', '-a', '-l', '-F', '-c', '-al', '-aF', '-ac', '-lF', '-lc', '-Fc']
  
  while 1
    " 画面をクリア
    silent !clear
    
    " ランダムなオプションを選択
    let random_index = rand() % len(options)
    let chosen_option = options[random_index]
    
    " SLコマンドをランダムなオプションで実行
    execute 'silent !sl ' . chosen_option
    
    " 実行したオプションをエコー表示
    echo "実行: sl " . chosen_option
    
    " 少し待機（秒）
    sleep 2
    
    " ユーザー入力をチェック（中断するには何かキーを押す）
    let c = getchar(0)
    if c != 0
      break
    endif
  endwhile
  
  echo "SLの連続実行を終了しました"
endfunction

" 関数を実行
call RunSLContinuously()
