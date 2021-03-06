クラスに対するアクセス制御

クラス全体へのアクセス制御に関しては２種類しかない。

名称　　　　　　　　　　　　指定方法　　　　　　　　　アクセスを許可する範囲
package private        (何も書かない)          自分と同じパッケージに属するクラス
public                 public                全てのクラス

イメージはpackage privateにすると設定したクラス自体が他パッケージに属したクラスから見れなくなる。
そのためメソッドはpublicでも他パッケージに属するクラスからはそのメソッドは呼び出せない。

非publicクラスの特徴
①クラスの名前はソースファイル名と異なってもよい。
②１つのソースファイルにクラスを複数宣言してもよい。
　　例）１つのファイルの中にpublicクラスと非publicクラスなど。

