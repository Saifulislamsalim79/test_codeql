package ai.kudi.agent.product.repository;

import ai.kudi.agent.bills.data.Product;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.Item;
import p425j.p444e.p470j0.ClassWriter;
/* compiled from: BillerRepositoryImpl.kt */
@Metadata(m10422d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m10421d2 = {"<anonymous>", "", "products", "", "Lai/kudi/agent/bills/data/Product;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class BillerRepositoryImpl$fetchFrequentlyUsedBillers$2 extends AbstractC11802m implements InterfaceC11767l<List<? extends Product>, C13666w> {
    final /* synthetic */ BillerRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillerRepositoryImpl$fetchFrequentlyUsedBillers$2(BillerRepositoryImpl billerRepositoryImpl) {
        super(1);
        this.this$0 = billerRepositoryImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m40229invoke$lambda0(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final void m40230invoke$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(List<? extends Product> list) {
        List<? extends Product> $r2 = list;
        invoke2((List) $r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List list) {
        Log_OC.getArray(list, "products");
        BillerRepositoryImpl $r3 = this.this$0;
        BillerRepository $r4 = $r3.getLocaldb();
        AbstractC11696w $r5 = $r4.saveProducts(list);
        Item $r6 = ClassWriter.LogError();
        AbstractC11696w $r52 = $r5.u($r6);
        FalseFileFilter $r7 = FalseFileFilter.FALSE;
        C0408c $r1 = C0408c.f949f;
        $r52.s($r7, $r1);
    }
}
