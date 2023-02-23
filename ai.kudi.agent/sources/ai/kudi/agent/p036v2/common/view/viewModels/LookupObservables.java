package ai.kudi.agent.p036v2.common.view.viewModels;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.v2.common.dto.PlanAmountField;
import androidx.lifecycle.C1583u;
import androidx.lifecycle.Extension;
import androidx.lifecycle.LiveData;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: LookupObservables.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010:\u001a\u00020;2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rJ\u000e\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0005J\u000e\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020\u0005J\u001a\u0010A\u001a\u00020;2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rJ\u001a\u0010C\u001a\u00020;2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rJ\u001a\u0010E\u001a\u00020;2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rJ\u001a\u0010G\u001a\u00020;2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rJ\u001a\u0010I\u001a\u00020;2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rJ\u001a\u0010J\u001a\u00020;2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rJ\u001a\u0010K\u001a\u00020;2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rJ\u001a\u0010L\u001a\u00020;2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002010\rJ\u000e\u0010M\u001a\u00020;2\u0006\u0010N\u001a\u00020\u0005J\u000e\u0010O\u001a\u00020;2\u0006\u0010P\u001a\u00020\u0005J\u001a\u0010Q\u001a\u00020;2\u0012\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rJ\u001a\u0010S\u001a\u00020;2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rJ\u000e\u0010T\u001a\u00020;2\u0006\u0010U\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0\u00048F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R#\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R#\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0\u00048F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R#\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0\u00048F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R#\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007R#\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010.\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R \u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002010\r0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020\u00050#X\u0082\u0004¢\u0006\u0002\n\u0000R#\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002010\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b7\u0010\u0007R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b9\u0010\u0007¨\u0006V"}, m10421d2 = {"Lai/kudi/agent/v2/common/view/viewModels/LookupObservables;", "Landroidx/lifecycle/ViewModel;", "()V", "agentWalletId", "Landroidx/lifecycle/LiveData;", "", "getAgentWalletId", "()Landroidx/lifecycle/LiveData;", "amountType", "getAmountType", "collectionAmount", "getCollectionAmount", "mapOfAllCollectionsProperties", "", "", "getMapOfAllCollectionsProperties", "mapOfAllCustomerDetails", "getMapOfAllCustomerDetails", "mapOfCollectionFiles", "getMapOfCollectionFiles", "mapOfCustomerLookUpDetails", "getMapOfCustomerLookUpDetails", "mapOfCustomerLookUpSummary", "getMapOfCustomerLookUpSummary", "mapOfLookupFiles", "getMapOfLookupFiles", "mapOfLookupProperties", "getMapOfLookupProperties", "mapOfRegistrationFiles", "getMapOfRegistrationFiles", "mapOfRegistrationProperties", "getMapOfRegistrationProperties", "mapOfRegistrationSummary", "getMapOfRegistrationSummary", "mutableAgentWalletId", "Landroidx/lifecycle/MutableLiveData;", "mutableAmountType", "mutableCollectionAmount", "mutableMapOfAllCollectionsProperties", "mutableMapOfAllCustomerDetails", "mutableMapOfCollectionFiles", "mutableMapOfCustomerLookUpDetails", "mutableMapOfCustomerLookUpSummary", "mutableMapOfLookupFiles", "mutableMapOfLookupProperties", "mutableMapOfRegistrationFiles", "mutableMapOfRegistrationProperties", "mutableMapOfRegistrationSummary", "mutablePlanAmountMap", "Lai/kudi/agent/v2/common/dto/PlanAmountField;", "mutableProductCode", "mutableProductID", "planAmountMap", "getPlanAmountMap", "productCode", "getProductCode", "productID", "getProductID", "setAllCustomerDetails", "", "customerDetails", "setAmountType", "type", "setCollectionAmount", TransactionField.AMOUNT, "setCustomerLookupDetails", "customerLookupDetails", "setCustomerLookupSummary", "summary", "setMapOfAllCollectionsProperties", "properties", "setMapOfCollectionFiles", "mapOfFiles", "setMapOfLookupFiles", "setMapOfLookupProperties", "setMapOfRegistrationFiles", "setPlanAmountMap", "setProductCode", "code", "setProductID", "id", "setRegistrationProperties", TransactionBreakDownItemType.DATA, "setRegistrationSummary", "setWalletId", "walletId", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.viewModels.LookupObservables */
/* loaded from: classes.dex */
public final class LookupObservables extends Extension {
    private final C1583u<String> mutableAgentWalletId;
    private final C1583u<String> mutableAmountType;
    private final C1583u<String> mutableCollectionAmount;
    private final C1583u<Map<String, Object>> mutableMapOfAllCollectionsProperties;
    private final C1583u<Map<String, String>> mutableMapOfAllCustomerDetails;
    private final C1583u<Map<String, String>> mutableMapOfCollectionFiles;
    private final C1583u<Map<String, String>> mutableMapOfCustomerLookUpDetails;
    private final C1583u<Map<String, String>> mutableMapOfCustomerLookUpSummary;
    private final C1583u<Map<String, String>> mutableMapOfLookupFiles;
    private final C1583u<Map<String, Object>> mutableMapOfLookupProperties;
    private final C1583u<Map<String, String>> mutableMapOfRegistrationFiles;
    private final C1583u<Map<String, Object>> mutableMapOfRegistrationProperties;
    private final C1583u<Map<String, String>> mutableMapOfRegistrationSummary;
    private final C1583u<Map<String, PlanAmountField>> mutablePlanAmountMap;
    private final C1583u<String> mutableProductCode;
    private final C1583u<String> mutableProductID;
    private final LiveData<Map<String, PlanAmountField>> planAmountMap;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LookupObservables() {
        C1583u $r1 = new C1583u();
        this.mutableCollectionAmount = $r1;
        C1583u $r12 = new C1583u();
        this.mutableAmountType = $r12;
        C1583u $r13 = new C1583u();
        this.mutableProductCode = $r13;
        C1583u $r14 = new C1583u();
        this.mutableProductID = $r14;
        C1583u $r15 = new C1583u();
        this.mutableMapOfCustomerLookUpDetails = $r15;
        C1583u $r16 = new C1583u();
        this.mutableMapOfCustomerLookUpSummary = $r16;
        C1583u $r17 = new C1583u();
        this.mutableMapOfAllCustomerDetails = $r17;
        C1583u $r18 = new C1583u();
        this.mutableMapOfAllCollectionsProperties = $r18;
        C1583u $r19 = new C1583u();
        this.mutableMapOfRegistrationSummary = $r19;
        C1583u $r110 = new C1583u();
        this.mutableMapOfRegistrationProperties = $r110;
        C1583u $r111 = new C1583u();
        this.mutableMapOfLookupProperties = $r111;
        C1583u $r112 = new C1583u();
        this.mutableAgentWalletId = $r112;
        C1583u $r113 = new C1583u();
        this.mutableMapOfLookupFiles = $r113;
        C1583u $r114 = new C1583u();
        this.mutableMapOfCollectionFiles = $r114;
        C1583u $r115 = new C1583u();
        this.mutableMapOfRegistrationFiles = $r115;
        C1583u $r116 = new C1583u();
        this.mutablePlanAmountMap = $r116;
        this.planAmountMap = $r116;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getAgentWalletId() {
        C1583u r1 = this.mutableAgentWalletId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getAmountType() {
        C1583u r1 = this.mutableAmountType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getCollectionAmount() {
        C1583u r1 = this.mutableCollectionAmount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfAllCollectionsProperties() {
        C1583u r1 = this.mutableMapOfAllCollectionsProperties;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfAllCustomerDetails() {
        C1583u r1 = this.mutableMapOfAllCustomerDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfCollectionFiles() {
        C1583u r1 = this.mutableMapOfCollectionFiles;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfCustomerLookUpDetails() {
        C1583u r1 = this.mutableMapOfCustomerLookUpDetails;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfCustomerLookUpSummary() {
        C1583u r1 = this.mutableMapOfCustomerLookUpSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfLookupFiles() {
        C1583u r1 = this.mutableMapOfLookupFiles;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfLookupProperties() {
        C1583u r1 = this.mutableMapOfLookupProperties;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfRegistrationFiles() {
        C1583u r1 = this.mutableMapOfRegistrationFiles;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfRegistrationProperties() {
        C1583u r1 = this.mutableMapOfRegistrationProperties;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getMapOfRegistrationSummary() {
        C1583u r1 = this.mutableMapOfRegistrationSummary;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getPlanAmountMap() {
        LiveData r1 = this.planAmountMap;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getProductCode() {
        C1583u r1 = this.mutableProductCode;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LiveData getProductID() {
        C1583u r1 = this.mutableProductID;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setAllCustomerDetails(Map map) {
        Log_OC.getArray(map, "customerDetails");
        C1583u $r2 = this.mutableMapOfAllCustomerDetails;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setAmountType(String str) {
        Log_OC.getArray(str, "type");
        C1583u $r2 = this.mutableAmountType;
        $r2.setValue(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setCollectionAmount(String str) {
        Log_OC.getArray(str, TransactionField.AMOUNT);
        C1583u $r2 = this.mutableCollectionAmount;
        $r2.setValue(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setCustomerLookupDetails(Map map) {
        Log_OC.getArray(map, "customerLookupDetails");
        C1583u $r2 = this.mutableMapOfCustomerLookUpDetails;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setCustomerLookupSummary(Map map) {
        Log_OC.getArray(map, "summary");
        C1583u $r2 = this.mutableMapOfCustomerLookUpSummary;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setMapOfAllCollectionsProperties(Map map) {
        Log_OC.getArray(map, "properties");
        C1583u $r2 = this.mutableMapOfAllCollectionsProperties;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setMapOfCollectionFiles(Map map) {
        Log_OC.getArray(map, "mapOfFiles");
        C1583u $r2 = this.mutableMapOfCollectionFiles;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setMapOfLookupFiles(Map map) {
        Log_OC.getArray(map, "mapOfFiles");
        C1583u $r2 = this.mutableMapOfLookupFiles;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setMapOfLookupProperties(Map map) {
        Log_OC.getArray(map, "properties");
        C1583u $r2 = this.mutableMapOfLookupProperties;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setMapOfRegistrationFiles(Map map) {
        Log_OC.getArray(map, "mapOfFiles");
        C1583u $r2 = this.mutableMapOfRegistrationFiles;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setPlanAmountMap(Map map) {
        Log_OC.getArray(map, "planAmountMap");
        C1583u $r2 = this.mutablePlanAmountMap;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setProductCode(String str) {
        Log_OC.getArray(str, "code");
        C1583u $r2 = this.mutableProductCode;
        $r2.setValue(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setProductID(String str) {
        Log_OC.getArray(str, "id");
        C1583u $r2 = this.mutableProductID;
        $r2.setValue(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setRegistrationProperties(Map map) {
        Log_OC.getArray(map, TransactionBreakDownItemType.DATA);
        C1583u $r2 = this.mutableMapOfRegistrationProperties;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setRegistrationSummary(Map map) {
        Log_OC.getArray(map, "summary");
        C1583u $r2 = this.mutableMapOfRegistrationSummary;
        $r2.setValue(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setWalletId(String str) {
        Log_OC.getArray(str, "walletId");
        C1583u $r2 = this.mutableAgentWalletId;
        $r2.setValue(str);
    }
}
