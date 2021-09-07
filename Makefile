install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

check-updates:
	./gradlew dependencyUpdates

make lint:
	./gradlew checkstyleMain

.PHONY: build
build:
	./gradlew clean build
