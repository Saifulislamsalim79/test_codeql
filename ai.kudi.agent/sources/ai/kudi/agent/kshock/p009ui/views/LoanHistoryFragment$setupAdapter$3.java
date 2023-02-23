package ai.kudi.agent.kshock.p009ui.views;

import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.feature_kshock.databinding.FragmentLoanHistoryBinding;
import ai.kudi.agent.kshock.p009ui.adapter.LoanHistoryAdapter;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import p201g.p259r.AbstractC8061y;
import p201g.p259r.C7904j;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoanHistoryFragment.kt */
@f(c = "ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$setupAdapter$3", f = "LoanHistoryFragment.kt", l = {177}, m = "invokeSuspend")
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m10421d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$setupAdapter$3 */
/* loaded from: classes.dex */
public final class LoanHistoryFragment$setupAdapter$3 extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {
    int label;
    final /* synthetic */ LoanHistoryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoanHistoryFragment$setupAdapter$3(LoanHistoryFragment loanHistoryFragment, InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
        this.this$0 = loanHistoryFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        LoanHistoryFragment $r2 = this.this$0;
        InterfaceC11714d r5 = new LoanHistoryFragment$setupAdapter$3($r2, interfaceC11714d);
        InterfaceC11714d $r1 = r5;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
        InterfaceC13932m0 $r3 = interfaceC13932m0;
        InterfaceC11714d<? super C13666w> $r4 = interfaceC11714d;
        Object $r1 = invoke2($r3, (InterfaceC11714d) $r4);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d interfaceC11714d) {
        InterfaceC11714d $r2 = create(interfaceC13932m0, interfaceC11714d);
        LoanHistoryFragment$setupAdapter$3 $r0 = (LoanHistoryFragment$setupAdapter$3) $r2;
        C13666w $r3 = C13666w.f30112a;
        Object $r4 = $r0.invokeSuspend($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final Object invokeSuspend(Object obj) {
        Object $r3;
        $r3 = C11734d.m10387d();
        int $i0 = this.label;
        if ($i0 == 0) {
            C13291q.m5357b(obj);
            LoanHistoryFragment $r5 = this.this$0;
            LoanHistoryAdapter $r6 = $r5.loansAdapter;
            if ($r6 == null) {
                Log_OC.LogError("loansAdapter");
                NullPointerException r9 = new NullPointerException("Null throw statement replaced by Soot");
                throw r9;
            }
            InterfaceC13964d $r7 = $r6.getLoadStateFlow();
            final LoanHistoryFragment $r52 = this.this$0;
            InterfaceC13969e<C7904j> interfaceC13969e = new InterfaceC13969e<C7904j>() { // from class: ai.kudi.agent.kshock.ui.views.LoanHistoryFragment$setupAdapter$3$invokeSuspend$$inlined$collect$1
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // kotlinx.coroutines.p559q2.InterfaceC13969e
                public Object emit(C7904j c7904j, InterfaceC11714d interfaceC11714d) {
                    C7904j $r32 = c7904j;
                    AbstractC8061y $r4 = $r32.m17083a();
                    boolean $z0 = $r4 instanceof AbstractC8061y.C8064c;
                    if ($z0) {
                        AbstractC8061y $r42 = $r32.m17083a();
                        boolean $z02 = $r42.m16805a();
                        if ($z02) {
                            LoanHistoryFragment $r53 = LoanHistoryFragment.this;
                            LoanHistoryAdapter $r62 = $r53.loansAdapter;
                            if ($r62 == null) {
                                Log_OC.LogError("loansAdapter");
                                NullPointerException r11 = new NullPointerException("Null throw statement replaced by Soot");
                                throw r11;
                            }
                            int $i02 = $r62.getItemCount();
                            if ($i02 < 1) {
                                LoanHistoryFragment $r54 = LoanHistoryFragment.this;
                                FragmentLoanHistoryBinding $r72 = $r54.requireBinding();
                                LinearLayout $r8 = $r72.emptyStateView;
                                Log_OC.loadImage($r8, "requireBinding().emptyStateView");
                                ViewExtKt.show($r8);
                                LoanHistoryFragment $r55 = LoanHistoryFragment.this;
                                FragmentLoanHistoryBinding $r73 = $r55.requireBinding();
                                View $r9 = $r73.shimmerLoader;
                                Log_OC.loadImage($r9, "requireBinding().shimmerLoader");
                                View r12 = $r9;
                                ViewExtKt.hide$default(r12, false, 1, null);
                            }
                        }
                    }
                    C13666w r10 = C13666w.f30112a;
                    return r10;
                }
            };
            this.label = 1;
            LoanHistoryFragment$setupAdapter$3 r12 = this;
            Object $r2 = $r7.mo3175a(interfaceC13969e, r12);
            if ($r2 == $r3) {
                return $r3;
            }
        } else if ($i0 != 1) {
            IllegalStateException r10 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw r10;
        } else {
            C13291q.m5357b(obj);
        }
        C13666w r8 = C13666w.f30112a;
        return r8;
    }
}
