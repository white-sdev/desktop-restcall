package org.white_sdev.desktoprestcall;

//import static com.google.common.base.Preconditions.checkNotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ReactiveHttpInputMessage;
import org.springframework.http.ReactiveHttpOutputMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * TODO: Complete class documentation
 *
 * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * @since 2022-Feb-05
 */
@Slf4j
public class DesktopRestCall {
	
	/**
	 * Main method of the application.
	 * This is the method that will launch the main process and run the provided application.
	 * This is a special method of the language used to launch the main thread;
	 * <a href='https://www.oracle.com/java/technologies/jpl1-building-applications.html#class'> more information</a>.
	 *
	 * @param args {@link String} Arguments provided by the caller of the application (Often omitted)
	 * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
	 * @since 2022/02/05
	 */
	public static void main(String[] args) {
		String logID = "::main(args[]): ";
		log.trace("{}Start", logID);
		try {
			
			new DesktopRestCall().init();
			
			
			log.trace("{}Finish", logID);
			System.exit(0);
		} catch (Exception e) {
			throw e;
		}
	}
	
	public void init() {
	    String logID="::init(): ";
		log.trace("{}Start", logID);
		try{
			
			
		
//			MappingJackson2HttpMessageConverter jsonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
//			((ObjectMapper)(jsonHttpMessageConverter.getObjectMapper())).configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//			restTemplate.getMessageConverters().add(jsonHttpMessageConverter);



//			MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//			converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
//			List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
//			messageConverters.add(converter);
//
//			RestTemplate restTemplate = new RestTemplate();
//			restTemplate.setMessageConverters(messageConverters);
//			ResponseEntity<String> result = restTemplate.postForEntity(new URI("https://u.gg/api"), new LoLJSON(), String.class);
			
			
//			String result= WebClient.builder().build()
//					.post()
//					.uri("https://u.gg/api")
//					.body(Mono.just(new LoLJSON()),LoLJSON.class)
//					.retrieve()
//					.bodyToMono(String.class)
//					.doOnNext(response -> System.out.println(response))
//					.block();
			
//			MultiValueMap<String, String> bodyValues = new LinkedMultiValueMap<>();
//			bodyValues.add("operationName", "FetchMatchSummaries");
//			bodyValues.add("query", "query FetchMatchSummaries($championId: [Int], $page: Int, $queueType: [Int], $regionId: String!, $role: [Int], $seasonIds: [Int]!, " +
//					"$summonerName: String!) {\n  fetchPlayerMatchSummaries(\n    championId: $championId\n    page: $page\n    queueType: $queueType\n    " +
//					"regionId: $regionId\n    role: $role\n    seasonIds: $seasonIds\n    summonerName: $summonerName\n  ) {\n    finishedMatchSummaries\n    " +
//					"totalNumMatches\n    matchSummaries {\n      assists\n      championId\n      cs\n      damage\n      deaths\n      gold\n      items\n   " +
//					"   jungleCs\n      killParticipation\n      kills\n      level\n      matchCreationTime\n      matchDuration\n      matchId\n      " +
//					"maximumKillStreak\n      primaryStyle\n      queueType\n      regionId\n      role\n      runes\n      subStyle\n      summonerName\n      " +
//					"summonerSpells\n      psHardCarry\n      psTeamPlay\n      lpInfo {\n        lp\n        placement\n        promoProgress\n        " +
//					"promoTarget\n        promotedTo {\n          tier\n          rank\n          __typename\n        }\n        __typename\n      }\n      " +
//					"teamA {\n        championId\n        summonerName\n        teamId\n        role\n        hardCarry\n        teamplay\n        __typename\n " +
//					"     }\n      teamB {\n        championId\n        summonerName\n        teamId\n        role\n        hardCarry\n        teamplay\n       " +
//					" __typename\n      }\n      version\n      visionScore\n      win\n      __typename\n    }\n    __typename\n  }\n}\n");
//			bodyValues.add("variables", "{\n" +
//					"\t\t\"regionId\": \"la1\", \"summonerName\": \"whiteking21\", \"queueType\": [], \"role\": [], \"seasonIds\": [18]\n" +
//					"\t}");
			
			LoLJSON loLJSON=new LoLJSON();
//			BodyInserter<LoLJSON, ReactiveHttpOutputMessage> bodyInserter=BodyInserters.fromValue(loLJSON);
//			log.info("{}bodyInserter: {}",logID,bodyInserter);
//			Mono<LoLJSON> loLJSONMono=Mono.just(loLJSON);
//
//			log.info("{} ObjectMapper:{}",logID,
//					 new com.fasterxml.jackson.databind.ObjectMapper().writeValueAsString(new PodamFactoryImpl().manufacturePojo(LoLJSON.class))
//				);
			
			
			String result = WebClient.builder().build().post()
					.uri(new URI("https://u.gg/api"))
//					.header("Authorization", "Bearer MY_SECRET_TOKEN")
//					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
//					.accept(MediaType.APPLICATION_JSON)
					.body(BodyInserters.fromValue(loLJSON))
//					.body(BodyInserters.fromFormData(bodyValues))
//					.body(bodyInserter)
//					.body(BodyInserters.fromObject(loLJSON))
//					.body(loLJSONMono,LoLJSON.class)
					.retrieve()
					.bodyToMono(String.class)
//					.doOnNext(System.out::println)
					.block();
			
			
			
			
			log.info("{}Obtained JSON as String: \n{}",logID,result);
			
		    log.trace("{}Finish", logID);
			
		} catch (Exception e) {
	        throw new RuntimeException("Impossible to complete init Method", e);
	    }
	}
	@Data
	class LoLJSON implements Serializable {
		public LoLJSON(){};
		public String operationName="FetchMatchSummaries";
		public String query="query FetchMatchSummaries($championId: [Int], $page: Int, $queueType: [Int], $regionId: String!, $role: [Int], $seasonIds: [Int]!, " +
				"$summonerName: String!) {\n  fetchPlayerMatchSummaries(\n    championId: $championId\n    page: $page\n    queueType: $queueType\n    " +
				"regionId: $regionId\n    role: $role\n    seasonIds: $seasonIds\n    summonerName: $summonerName\n  ) {\n    finishedMatchSummaries\n    " +
				"totalNumMatches\n    matchSummaries {\n      assists\n      championId\n      cs\n      damage\n      deaths\n      gold\n      items\n   " +
				"   jungleCs\n      killParticipation\n      kills\n      level\n      matchCreationTime\n      matchDuration\n      matchId\n      " +
				"maximumKillStreak\n      primaryStyle\n      queueType\n      regionId\n      role\n      runes\n      subStyle\n      summonerName\n      " +
				"summonerSpells\n      psHardCarry\n      psTeamPlay\n      lpInfo {\n        lp\n        placement\n        promoProgress\n        " +
				"promoTarget\n        promotedTo {\n          tier\n          rank\n          __typename\n        }\n        __typename\n      }\n      " +
				"teamA {\n        championId\n        summonerName\n        teamId\n        role\n        hardCarry\n        teamplay\n        __typename\n " +
				"     }\n      teamB {\n        championId\n        summonerName\n        teamId\n        role\n        hardCarry\n        teamplay\n       " +
				" __typename\n      }\n      version\n      visionScore\n      win\n      __typename\n    }\n    __typename\n  }\n}\n";
		public Variables variables= new Variables();
	}
	@Data
	class Variables implements Serializable{
		public Variables(){};
		public String regionId="la1";
		public String summonerName="whiteking21";
		public int[] queueType=new int[0];
		public int[] role=new int[0];
		public int[] seasonIds= {18};
		
	}
}