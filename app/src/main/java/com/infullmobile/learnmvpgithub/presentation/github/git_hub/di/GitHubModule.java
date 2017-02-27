package com.infullmobile.learnmvpgithub.presentation.github.git_hub.di;

import android.content.Context;

import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubActivity;
import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubModel;
import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubPresenter;
import com.infullmobile.learnmvpgithub.presentation.github.git_hub.GitHubView;

import dagger.Module;
import dagger.Provides;

@Module
public class GitHubModule {

	private GitHubActivity activity;

	public GitHubModule(GitHubActivity activity) {
		this.activity = activity;
	}

	@GitHubScope
	@Provides
	Context providesContext() {
		return activity;
	}

	@GitHubScope
	@Provides
	GitHubView providesGitHubView() {
		return new GitHubView();
	}

	@GitHubScope
	@Provides
	public GitHubModel providesGitHubModel() {
		return new GitHubModel();
	}

	@GitHubScope
	@Provides
	GitHubPresenter providesGitHubPresenter(GitHubModel model,
			GitHubView view) {
		return new GitHubPresenter(model, view);
	}
}
