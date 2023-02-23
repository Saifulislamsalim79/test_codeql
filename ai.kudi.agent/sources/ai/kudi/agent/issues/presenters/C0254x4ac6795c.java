package ai.kudi.agent.issues.presenters;

import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13262h;
/* compiled from: IssueResolutionFragmentPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.presenters.IssueResolutionFragmentPresenter$isKeyWordsInDescriptionSuggestingChargeback$joinToString$1 */
/* loaded from: classes.dex */
final class C0254x4ac6795c extends AbstractC11802m implements InterfaceC11767l<String, CharSequence> {
    public static final C0254x4ac6795c INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0254x4ac6795c $r0 = new C0254x4ac6795c();
        INSTANCE = $r0;
    }

    C0254x4ac6795c() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(String str) {
        Log_OC.getArray(str, "it");
        C13262h.C13263a $r2 = C13262h.f29428d;
        String $r1 = $r2.m5518a(str);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
        String $r3 = str;
        CharSequence $r1 = invoke2($r3);
        return $r1;
    }
}
