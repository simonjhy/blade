/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package blade.indexerpostprocessor;

import java.util.Locale;

import javax.portlet.PortletURL;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.IndexerPostProcessor;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;


@Component(
	immediate = true,
	property = {
		"indexer.class.name=com.liferay.portlet.blogs.util.BlogsIndexer"
	},
	service=IndexerPostProcessor.class
)
public class BlogsIndexerPostProcessor implements IndexerPostProcessor {


	@Override
	public void postProcessContextQuery(BooleanQuery contextQuery,
			SearchContext searchContext) throws Exception {

		_log.info("postProcessContextQuery");
	}

	@Override
	public void postProcessDocument(Document document, Object obj)
			throws Exception {

		_log.info("postProcessDocument");
	}

	@Override
	public void postProcessFullQuery(BooleanQuery fullQuery,
			SearchContext searchContext) throws Exception {

		_log.info("postProcessFullQuery");
	}

	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery,
			SearchContext searchContext) throws Exception {

		_log.info("postProcessSearchQuery");
	}

	@Override
	public void postProcessSummary(Summary summary, Document document,
			Locale locale, String snippet) {

		_log.info("postProcessSummary");
	}

	private Log _log = LogFactoryUtil.getLog(BlogsIndexerPostProcessor.class);

}
