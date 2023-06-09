package guvi.TestScenarios;

import org.testng.annotations.Test;

import Base.BaseClass;
import guvi.PageObject.PaymentInfo;
import guvi.PageObject.ShopbyDep;

public class PaymentInfoTest extends BaseClass
{

	@Test(priority=1)
	public void PaymentInformation()
	{
		ShopbyDep dep=new ShopbyDep(driver);
		dep.selectUSRegion();
		dep.shopbyDepartment();
		dep.verifyOrderDetails();
		
		PaymentInfo payInfo=new PaymentInfo(driver);
		payInfo.Checkoutinfo();
		payInfo.ContinuePaymentPage();
	}
}
