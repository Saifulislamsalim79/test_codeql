package ai.kudi.agent.core.util;

import androidx.fragment.app.Chapter;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.InterfaceC13932m0;
/* compiled from: FragmentExtension.kt */
@f(c = "ai.kudi.agent.core.util.FragmentExtensionKt$dismissWhenResumed$1", f = "FragmentExtension.kt", l = {}, m = "invokeSuspend")
@Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m10421d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class FragmentExtensionKt$dismissWhenResumed$1 extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {
    final /* synthetic */ Chapter $this_dismissWhenResumed;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentExtensionKt$dismissWhenResumed$1(Chapter chapter, InterfaceC11714d interfaceC11714d) {
        super(2, interfaceC11714d);
        this.$this_dismissWhenResumed = chapter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final InterfaceC11714d create(Object obj, InterfaceC11714d interfaceC11714d) {
        Chapter $r2 = this.$this_dismissWhenResumed;
        InterfaceC11714d r5 = new FragmentExtensionKt$dismissWhenResumed$1($r2, interfaceC11714d);
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
        FragmentExtensionKt$dismissWhenResumed$1 $r0 = (FragmentExtensionKt$dismissWhenResumed$1) $r2;
        C13666w $r3 = C13666w.f30112a;
        Object $r4 = $r0.invokeSuspend($r3);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final Object invokeSuspend(Object obj) {
        C11734d.m10387d();
        int $i0 = this.label;
        if ($i0 != 0) {
            IllegalStateException $r3 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw $r3;
        }
        C13291q.m5357b(obj);
        Chapter $r2 = this.$this_dismissWhenResumed;
        $r2.dismiss();
        C13666w r4 = C13666w.f30112a;
        return r4;
    }
}
