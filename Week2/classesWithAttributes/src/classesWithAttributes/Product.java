package classesWithAttributes;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String color) {
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
		this._color=color;
	}
	
	public Product() {
		
	}

	private int _id;
	private String _name;
	private String _description;
	private int _stockAmount;
	private double _price;
	private String _color;
	private String _kod;

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		this._name = name;
	}

	public String get_color() {
		return _color;
	}

	public void set_color(String color) {
		this._color = color;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int id) {
		this._id = id;
	}

	public String getKod() {
		return this._name.substring(0, 1) + _id;
	}

}
