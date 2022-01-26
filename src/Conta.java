
public abstract class Conta implements Iconta{
	
	private String tipoconta;
	private String tipocliente;
	private String dataabetura;
	private String nomecliente;
	private double saldo;
	
	public String getTipoconta() {
		return tipoconta;
	}
	public void setTipoconta(String tipoconta) {
		this.tipoconta = tipoconta;
	}
	public String getTipocliente() {
		return tipocliente;
	}
	public void setTipocliente(String tipocliente) {
		this.tipocliente = tipocliente;
	}
	public String getDataabetura() {
		return dataabetura;
		
		
	}
	public String getNomecliente() {
		return nomecliente;
	}
	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public void setDataabetura(String dataabetura) {
		this.dataabetura = dataabetura;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String sacar(double valor) {
		boolean valorsaldo = false;
		if (valorsaldo) {
			saldo =saldo -valor;
			return "saque realizado";
			
		}else {
			return "saldo insuficiente";
			
		}
	}
		
		public double depositar(double valor) {
			saldo += valor;
			return saldo;
		}
}
	
	