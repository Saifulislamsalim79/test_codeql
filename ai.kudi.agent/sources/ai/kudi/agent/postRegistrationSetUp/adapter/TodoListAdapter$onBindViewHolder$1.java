package ai.kudi.agent.postRegistrationSetUp.adapter;

import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TodoListAdapter.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m10421d2 = {"<anonymous>", "", "todo", "", "isTodoDone", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class TodoListAdapter$onBindViewHolder$1 extends AbstractC11802m implements InterfaceC11771p<String, Boolean, C13666w> {
    final /* synthetic */ TodoListAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodoListAdapter$onBindViewHolder$1(TodoListAdapter todoListAdapter) {
        super(2);
        this.this$0 = todoListAdapter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11771p
    public /* bridge */ /* synthetic */ C13666w invoke(String str, Boolean bool) {
        String $r3 = str;
        Boolean $r4 = bool;
        boolean $z0 = $r4.booleanValue();
        invoke($r3, $z0);
        C13666w r5 = C13666w.f30112a;
        return r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(String str, boolean z) {
        Log_OC.getArray(str, "todo");
        TodoListAdapter $r2 = this.this$0;
        InterfaceC11771p $r3 = $r2.getOnClickListener();
        Boolean $r4 = Boolean.valueOf(z);
        $r3.invoke(str, $r4);
    }
}
