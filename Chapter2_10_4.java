正しい継承、間違った継承

正しい継承
  子クラスは親クラスの一種である。（is-aの原則）
  例）スーパーヒーローはヒーロの一種である


間違った継承の例
  現実世界の登場人物に概念としてis-aの関係がないにもかかわらず継承を使っているもの。
  動くか、動かないか、便利か便利でないかという基準でなくis-aになっているかが基準。

is-aの原則が成立しなければ継承は使ってはいけない

is-aの関係ではない継承をしてはいけない理由
・将来クラスを拡張して行った際に現実世界との矛盾が生じるから。
・オブジェクト指向の３大機能の多態性を利用できなくなるから。

正しい継承がis-aの関係で結ばれれば子クラスになるほど具体的（特化）していき、親クラスになるほど
抽象的（汎化）していく。

継承関係を表す図を　継承ツリー　と呼ぶ。

クラス図に置いて継承関係を表す矢印はクラスが汎化していく方向を表すための矢印。

継承はある２つのクラスに特化、汎化の関係があることを示すための道具でもある。