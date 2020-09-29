オブジェクト指向の全体像と本質

普段プログラミングを用いて開発する際は現実世界の物事を自動化させるために行う。

第一部のプログラミング手法は　手続き型プログラミング　と呼ばれている。
開発者が考え、コンピュータがどう動けば良いかの手順をか考え、プログラムの先頭
から順番に命令として記述していく方法。

一方。オブジェクト指向で開発する場合、まずプログラムで実現しようとする現実世界を観察する。
例えば銀行振り込みの手続きをプログラム化する場合、銀行窓口での取り扱いをい設計図に書く。
この設計はITの知識のない人が見ても理解できるものでなければならない。
そしてそこに登場する人、物を一つの部品と考えクラス化して記述していく。

オブジェクト指向による部品化のルール
現実世界に出てくる登場人物の単位でプログラムをクラスに分割する。

例）
国内の複数の倉庫に在庫のある書籍をネットで販売するシステムを作る場合
本の販売業務を観察した上で、必要なもの（オブジェクト）は本、倉庫、顧客、購入記録と判断し
設計図を書く。このようにオブジェクトをどう作るか、どのように連携させるかを１番に意識して
開発するのがオブジェクト指向

オブジェクト指向を使うと複雑なプログラムも把握しやすくなる理由
よく理解している現実世界をまねして作られたプログラムは人間にとって理解しやすいから。

オブジェクト指向の本質
現実世界の登場人物とその振る舞いをコンピュータ内の仮想世界で再現する。
