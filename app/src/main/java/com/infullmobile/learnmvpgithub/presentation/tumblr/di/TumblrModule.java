package com.infullmobile.learnmvpgithub.presentation.tumblr.di;

import android.content.Context;

import com.infullmobile.learnmvpgithub.presentation.tumblr.TumblrActivity;
import com.infullmobile.learnmvpgithub.presentation.tumblr.TumblrModel;
import com.infullmobile.learnmvpgithub.presentation.tumblr.TumblrPresenter;
import com.infullmobile.learnmvpgithub.presentation.tumblr.TumblrView;

import dagger.Module;
import dagger.Provides;

@Module
public class TumblrModule {

	private TumblrActivity activity;

	public TumblrModule(TumblrActivity activity) {
		this.activity = activity;
	}

	@TumblrScope
	@Provides
	Context providesContext() {
		return activity;
	}

	@TumblrScope
	@Provides
	TumblrView providesTumblrView() {
		return new TumblrView();
	}

	@TumblrScope
	@Provides
	public TumblrModel providesTumblrModel() {
		return new TumblrModel();
	}

	@TumblrScope
	@Provides
	TumblrPresenter providesTumblrPresenter(TumblrModel model,
			TumblrView view) {
		return new TumblrPresenter(model, view);
	}
}
