package curriculum_D;

// キャラクターの共通データを持つクラス
public class Character {

	// フィールド（キャラの情報）
	private String name; // 名前
	private int hp; // HP（体力）
	private int at; // AT（攻撃力）
	private int sp; // SP（素早さ）

	// コンストラクタ（キャラを作るときにデータを入れる）
	public Character(String name, int hp, int at, int sp) {
		this.name = name; // 名前セット
		this.hp = hp; // HPセット
		this.at = at; // ATセット
		this.sp = sp; // SPセット
	}

	// ----------- getter（値を返すメソッド）-----------
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAt() {
		return at;
	}

	public int getSp() {
		return sp;
	}

	// HP を変更する setter
	public void setHp(int newHp) {
		this.hp = newHp;
	}

	// キャラが生きてるか判定（HP > 0）
	public boolean isAlive() {
		return this.hp > 0;
	}

	// ステータスを文字として返す
	public String getStatus() {
		return "HP:" + hp + " AT:" + at + " SP:" + sp;
	}
}
