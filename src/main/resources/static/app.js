angular.module('NamesApp', ['ngResource', 'ngAnimate'])
    .controller('NamesController', ['$resource', '$scope',
        function($resource, $scope) {

            var PeopleResource = $resource('/people/');

            PeopleResource.get().$promise.then(
                function(data) {
                    $scope.people = data._embedded.persons;
                });
    }]);
