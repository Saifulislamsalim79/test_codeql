package ai.kudi.agent.product.airtime_data.data;

import ai.kudi.agent.bills.domain.wiki.BillRequest;
import android.location.Location;
import android.os.Parcelable;
import kotlin.Metadata;
/* compiled from: AirtimePurchaseRequest.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "Landroid/os/Parcelable;", "getProductId", "", "getRequestAmount", "", "getRequestType", "setRequestServiceFee", "serviceFee", "toBillerRequest", "Lai/kudi/agent/bills/domain/dto/BillRequest;", "location", "Landroid/location/Location;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface ProductPurchase extends Parcelable {
    String getProductId();

    int getRequestAmount();

    String getRequestType();

    ProductPurchase setRequestServiceFee(String str);

    BillRequest toBillerRequest(Location location);
}
