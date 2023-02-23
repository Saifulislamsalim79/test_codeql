package ai.kudi.agent.postRegistrationSetUp.adapter;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.TodoListLayoutItem2Binding;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TodoListAdapter.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/adapter/TodoListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lai/kudi/agent/databinding/TodoListLayoutItem2Binding;", "context", "Landroid/content/Context;", "(Lai/kudi/agent/databinding/TodoListLayoutItem2Binding;Landroid/content/Context;)V", "bind", "", "todoItem", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoItem;", "onClickListener", "Lkotlin/Function2;", "", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TodoListViewHolder extends RecyclerView.AbstractC1620e0 {
    private final TodoListLayoutItem2Binding binding;
    private final Context context;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TodoListViewHolder(ai.kudi.agent.databinding.TodoListLayoutItem2Binding r5, android.content.Context r6) {
        /*
            r4 = this;
            java.lang.String r0 = "binding"
            kotlin.p483e0.p485d.Log_OC.getArray(r5, r0)
            java.lang.String r0 = "context"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            androidx.cardview.widget.CardView r1 = r5.getRoot()
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            r2 = r3
            r4.<init>(r2)
            r4.binding = r5
            r4.context = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.postRegistrationSetUp.adapter.TodoListViewHolder.<init>(ai.kudi.agent.databinding.TodoListLayoutItem2Binding, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: bind$lambda-0  reason: not valid java name */
    public static final void m40139bind$lambda0(InterfaceC11771p interfaceC11771p, TodoItem todoItem, View view) {
        Log_OC.getArray(interfaceC11771p, "$onClickListener");
        Log_OC.getArray(todoItem, "$todoItem");
        String $r3 = todoItem.getTodo();
        boolean $z0 = todoItem.isLowPriority();
        Boolean $r4 = Boolean.valueOf($z0);
        interfaceC11771p.invoke($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void bind(final TodoItem todoItem, final InterfaceC11771p interfaceC11771p) {
        Log_OC.getArray(todoItem, "todoItem");
        Log_OC.getArray(interfaceC11771p, "onClickListener");
        TodoListLayoutItem2Binding $r3 = this.binding;
        TextView $r4 = $r3.todoTextView;
        CharSequence $r5 = todoItem.getTodo();
        TextView r11 = $r4;
        r11.setText($r5);
        boolean $z0 = todoItem.isLowPriority();
        if ($z0) {
            TodoListLayoutItem2Binding $r32 = this.binding;
            View $r6 = $r32.todoIndicator;
            Context $r7 = this.context;
            int $i0 = ContextExtKt.getKudiColor($r7, C0001R.color.todo_done_indicator);
            $r6.setBackgroundColor($i0);
        } else {
            TodoListLayoutItem2Binding $r33 = this.binding;
            View $r62 = $r33.todoIndicator;
            Context $r72 = this.context;
            int $i02 = ContextExtKt.getKudiColor($r72, C0001R.color.todo_undone_indicator);
            $r62.setBackgroundColor($i02);
        }
        TodoListLayoutItem2Binding $r34 = this.binding;
        FrameLayout $r8 = $r34.getRoot();
        FrameLayout r12 = $r8;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.postRegistrationSetUp.adapter.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC11771p $r2 = InterfaceC11771p.this;
                TodoItem $r35 = todoItem;
                TodoListViewHolder.m40139bind$lambda0($r2, $r35, view);
            }
        });
    }
}
