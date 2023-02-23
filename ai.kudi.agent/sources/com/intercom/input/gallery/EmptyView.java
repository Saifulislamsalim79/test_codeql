package com.intercom.input.gallery;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes2.dex */
public class EmptyView extends LinearLayout {
    private Button actionButton;
    private String actionButtonText;
    private int internalPaddingBottom;
    private int internalPaddingLeft;
    private int internalPaddingRight;
    private int internalPaddingTop;
    private TextView subtitle;
    private String subtitleText;
    private TextView title;
    private String titleText;

    public EmptyView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.title = (TextView) findViewById(C7177R.C7179id.empty_text_title);
        this.subtitle = (TextView) findViewById(C7177R.C7179id.empty_text_subtitle);
        this.actionButton = (Button) findViewById(C7177R.C7179id.empty_action_button);
        this.title.setText(this.titleText);
        this.subtitle.setText(this.subtitleText);
        if (!TextUtils.isEmpty(this.actionButtonText)) {
            this.actionButton.setText(this.actionButtonText);
        } else {
            this.actionButton.setVisibility(8);
        }
        ((LinearLayout) findViewById(C7177R.C7179id.empty_view_layout)).setPadding(this.internalPaddingLeft, this.internalPaddingTop, this.internalPaddingRight, this.internalPaddingBottom);
    }

    public void setActionButtonClickListener(View.OnClickListener onClickListener) {
        this.actionButton.setOnClickListener(onClickListener);
    }

    public void setActionButtonVisibility(int i) {
        this.actionButton.setVisibility(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.subtitle.setText(charSequence);
    }

    public void setThemeColor(int i) {
        this.actionButton.setBackgroundColor(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.title.setText(charSequence);
    }

    public EmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(C7177R.C7180layout.intercom_composer_empty_view, (ViewGroup) this, true);
        setBackgroundResource(C7177R.color.intercom_composer_white);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7177R.styleable.intercom_composer_empty_view, 0, 0);
        try {
            try {
                this.titleText = obtainStyledAttributes.getString(C7177R.styleable.intercom_composer_empty_view_intercom_composer_titleText);
                this.subtitleText = obtainStyledAttributes.getString(C7177R.styleable.intercom_composer_empty_view_intercom_composer_subtitleText);
                this.actionButtonText = obtainStyledAttributes.getString(C7177R.styleable.intercom_composer_empty_view_intercom_composer_actionButtonText);
                this.internalPaddingTop = obtainStyledAttributes.getDimensionPixelSize(C7177R.styleable.f17113x718ab929, 0);
                this.internalPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(C7177R.styleable.f17110xdfada1d7, 0);
                this.internalPaddingLeft = obtainStyledAttributes.getDimensionPixelSize(C7177R.styleable.f17111xbfc8a2b3, 0);
                this.internalPaddingRight = obtainStyledAttributes.getDimensionPixelSize(C7177R.styleable.f17112x39a214f0, 0);
            } catch (RuntimeException unused) {
                this.titleText = "";
                this.subtitleText = "";
                this.actionButtonText = "";
                this.internalPaddingTop = 0;
                this.internalPaddingBottom = 0;
                this.internalPaddingLeft = 0;
                this.internalPaddingRight = 0;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void setSubtitle(int i) {
        this.subtitle.setText(i);
    }

    public void setTitle(int i) {
        this.title.setText(i);
    }
}
