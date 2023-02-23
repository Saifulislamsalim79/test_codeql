package com.intercom.composer.input.iconbar;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.intercom.composer.C7163R;
import com.intercom.composer.input.Input;
/* loaded from: classes2.dex */
class InputIconViewHolder extends RecyclerView.AbstractC1620e0 implements View.OnClickListener {
    final ImageView imageView;
    final InputClickedListener listener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputIconViewHolder(View view, InputClickedListener inputClickedListener) {
        super(view);
        this.listener = inputClickedListener;
        ImageView imageView = (ImageView) view.findViewById(C7163R.C7165id.input_icon_image_view);
        this.imageView = imageView;
        imageView.setOnClickListener(this);
        view.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bind(Input input, boolean z) {
        ImageView imageView = this.imageView;
        imageView.setImageDrawable(input.getIconDrawable(imageView.getContext()));
        this.imageView.setSelected(z);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.listener.onInputClicked(this);
    }
}
