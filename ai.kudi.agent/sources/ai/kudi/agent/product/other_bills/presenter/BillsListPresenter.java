package ai.kudi.agent.product.other_bills.presenter;

import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.product.other_bills.views.BillListView;
import ai.kudi.agent.product.repository.BillerRepository;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
/* compiled from: BillsListPresenter.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/presenter/BillsListPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/product/other_bills/views/BillListView;", "billerRepository", "Lai/kudi/agent/product/repository/BillerRepository;", "(Lai/kudi/agent/product/repository/BillerRepository;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "destroy", "", "fetchBillers", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class BillsListPresenter extends C9410b<BillListView> {
    public static final String AIRTIME = "Airtime";
    public static final Companion Companion;
    private final BillerRepository billerRepository;
    private final C11280b compositeDisposable;

    /* compiled from: BillsListPresenter.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/product/other_bills/presenter/BillsListPresenter$Companion;", "", "()V", "AIRTIME", "", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BillsListPresenter(BillerRepository billerRepository) {
        Log_OC.getArray(billerRepository, "billerRepository");
        this.billerRepository = billerRepository;
        C11280b $r2 = new C11280b();
        this.compositeDisposable = $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:11:0x005b */
    /* JADX WARN: Incorrect condition in loop: B:4:0x001e */
    /* renamed from: fetchBillers$lambda-3  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m40196fetchBillers$lambda3(ai.kudi.agent.product.other_bills.presenter.BillsListPresenter r21, java.util.List r22) {
        /*
            java.lang.String r2 = "this$0"
            r0 = r21
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            java.lang.String r2 = "billers"
            r0 = r22
            kotlin.p483e0.p485d.Log_OC.loadImage(r0, r2)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r4 = r3
            r3.<init>()
            r0 = r22
            java.util.Iterator r5 = r0.iterator()
        L1a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L47
            java.lang.Object r7 = r5.next()
            r9 = r7
            ai.kudi.agent.bills.data.Biller r9 = (ai.kudi.agent.bills.data.Biller) r9
            r8 = r9
            java.lang.String r10 = r8.getHeader()
            java.lang.Object r11 = r4.get(r10)
            r12 = r11
            if (r11 != 0) goto L3c
            java.util.ArrayList r13 = new java.util.ArrayList
            r12 = r13
            r13.<init>()
            r4.put(r10, r12)
        L3c:
            r14 = r12
            java.util.List r14 = (java.util.List) r14
            r22 = r14
            r0 = r22
            r0.add(r7)
            goto L1a
        L47:
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r3 = r15
            r15.<init>()
            java.util.Set r16 = r4.entrySet()
            r0 = r16
            java.util.Iterator r5 = r0.iterator()
        L57:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8a
            java.lang.Object r7 = r5.next()
            r18 = r7
            java.util.Map$Entry r18 = (java.util.Map.Entry) r18
            r17 = r18
            r0 = r17
            java.lang.Object r7 = r0.getKey()
            java.lang.String r2 = "Airtime"
            boolean r6 = kotlin.p483e0.p485d.Log_OC.append(r7, r2)
            r19 = 1
            r0 = r19
            r6 = r6 ^ r0
            if (r6 == 0) goto L57
            r0 = r17
            java.lang.Object r7 = r0.getKey()
            r0 = r17
            java.lang.Object r11 = r0.getValue()
            r3.put(r7, r11)
            goto L57
        L8a:
            ai.kudi.agent.product.other_bills.presenter.NumberPicker$TwoDigitFormatter r20 = new ai.kudi.agent.product.other_bills.presenter.NumberPicker$TwoDigitFormatter
            r0 = r20
            r0.<init>()
            r0 = r21
            r1 = r20
            r0.ifViewAttached(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.product.other_bills.presenter.BillsListPresenter.m40196fetchBillers$lambda3(ai.kudi.agent.product.other_bills.presenter.BillsListPresenter, java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchBillers$lambda-3$lambda-2  reason: not valid java name */
    public static final void m40197fetchBillers$lambda3$lambda2(Map map, BillListView billListView) {
        Log_OC.getArray(map, "$headers");
        Log_OC.getArray(billListView, "it");
        billListView.showBillers(map);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.C9410b, p272h.p364d.p365a.p366c.InterfaceC9413d
    public void destroy() {
        super.destroy();
        C11280b $r1 = this.compositeDisposable;
        $r1.m11212i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchBillers() {
        BillerRepository $r2 = this.billerRepository;
        AbstractC11696w $r3 = $r2.fetchBillers();
        Object object = new Object() { // from class: ai.kudi.agent.product.other_bills.presenter.ReplaySubject$UnboundedReplayState
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BillsListPresenter $r1 = BillsListPresenter.this;
                List $r32 = (List) obj;
                BillsListPresenter.m40196fetchBillers$lambda3($r1, $r32);
            }
        };
        Token $r1 = Token.BOOL;
        FavoritesArrayAdapter $r5 = $r3.s(object, $r1);
        Log_OC.loadImage($r5, "billerRepository.fetchBillers().subscribe(\n            { billers ->\n                val headers = billers.groupBy { it.header }.filter { it.key != AIRTIME }\n                ifViewAttached { it.showBillers(headers) }\n            },\n            { it.printStackTrace() }\n        )");
        C11280b $r6 = this.compositeDisposable;
        RxExtKt.addTo($r5, $r6);
    }
}
