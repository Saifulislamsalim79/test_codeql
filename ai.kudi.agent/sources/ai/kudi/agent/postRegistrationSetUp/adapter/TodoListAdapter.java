package ai.kudi.agent.postRegistrationSetUp.adapter;

import ai.kudi.agent.databinding.TodoListLayoutItem2Binding;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: TodoListAdapter.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0014\u0010\u0017\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u0018R#\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/postRegistrationSetUp/adapter/TodoListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoListViewHolder;", "onClickListener", "Lkotlin/Function2;", "", "", "", "(Lkotlin/jvm/functions/Function2;)V", "getOnClickListener", "()Lkotlin/jvm/functions/Function2;", "todoItems", "", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoItem;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TodoListAdapter extends RecyclerView.AbstractC1623h<TodoListViewHolder> {
    private final InterfaceC11771p<String, Boolean, C13666w> onClickListener;
    private List<TodoItem> todoItems;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TodoListAdapter(InterfaceC11771p interfaceC11771p) {
        Log_OC.getArray(interfaceC11771p, "onClickListener");
        this.onClickListener = interfaceC11771p;
        ArrayList $r2 = new ArrayList();
        this.todoItems = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        List $r1 = this.todoItems;
        int $i0 = $r1.size();
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11771p getOnClickListener() {
        InterfaceC11771p r1 = this.onClickListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onBindViewHolder  reason: avoid collision after fix types in other method */
    public void onBindViewHolder2(TodoListViewHolder todoListViewHolder, int i) {
        Log_OC.getArray(todoListViewHolder, "holder");
        List $r3 = this.todoItems;
        Object $r2 = $r3.get(i);
        TodoItem $r4 = (TodoItem) $r2;
        TodoListAdapter$onBindViewHolder$1 $r5 = new TodoListAdapter$onBindViewHolder$1(this);
        todoListViewHolder.bind($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ void onBindViewHolder(TodoListViewHolder todoListViewHolder, int i) {
        TodoListViewHolder $r2 = todoListViewHolder;
        onBindViewHolder2($r2, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public TodoListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log_OC.getArray(viewGroup, "parent");
        LayoutInflater $r4 = LayoutInflater.from(viewGroup.getContext());
        TodoListLayoutItem2Binding $r5 = TodoListLayoutItem2Binding.inflate($r4, viewGroup, false);
        Log_OC.loadImage($r5, "inflate(LayoutInflater.from(parent.context), parent, false)");
        Context $r3 = viewGroup.getContext();
        Log_OC.loadImage($r3, "parent.context");
        TodoListViewHolder $r2 = new TodoListViewHolder($r5, $r3);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public /* bridge */ /* synthetic */ TodoListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        TodoListViewHolder $r1 = onCreateViewHolder(viewGroup, i);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setData(List list) {
        Log_OC.getArray(list, "todoItems");
        List $r2 = this.todoItems;
        $r2.clear();
        List $r22 = this.todoItems;
        $r22.addAll(list);
        notifyDataSetChanged();
    }
}
